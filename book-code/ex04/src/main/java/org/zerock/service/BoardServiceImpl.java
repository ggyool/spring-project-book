package org.zerock.service;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapper;

import java.util.List;

@Service
//@AllArgsConstructor
//@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

//    @Autowired
//    @Setter(onMethod_ = @Autowired)
    private final BoardMapper mapper;

    public BoardServiceImpl(BoardMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void register(BoardVO board) {
        mapper.insertSelectKey(board);
    }

    @Override
    public BoardVO get(Long bno) {
        return mapper.read(bno);
    }

    @Override
    public boolean modify(BoardVO board) {
        return mapper.update(board) == 1;
    }

    @Override
    public boolean remove(Long bno) {
        return mapper.delete(bno) == 1;
    }

//    @Override
//    public List<BoardVO> getList() {
//        return mapper.getList();
//    }
    @Override
    public List<BoardVO> getList(Criteria cri) {
        return mapper.getListWithPaging(cri);
    }

    @Override
    public int getTotalCount(Criteria cri) {
        return mapper.getTotalCount(cri);
    }
}
