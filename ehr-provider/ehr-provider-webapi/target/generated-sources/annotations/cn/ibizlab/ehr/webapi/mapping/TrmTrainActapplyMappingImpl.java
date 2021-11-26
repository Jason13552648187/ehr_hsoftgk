package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainActapply;
import cn.ibizlab.ehr.webapi.dto.TrmTrainActapplyDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:54+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrainActapplyMappingImpl implements TrmTrainActapplyMapping {

    @Override
    public TrmTrainActapply toDomain(TrmTrainActapplyDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainActapply trmTrainActapply = new TrmTrainActapply();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainActapply.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainActapply.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getJhpxrs() != null ) {
            trmTrainActapply.setJhpxrs( dto.getJhpxrs() );
        }
        if ( dto.getPxmb() != null ) {
            trmTrainActapply.setPxmb( dto.getPxmb() );
        }
        if ( dto.getPxnr() != null ) {
            trmTrainActapply.setPxnr( dto.getPxnr() );
        }
        if ( dto.getPxfs() != null ) {
            trmTrainActapply.setPxfs( dto.getPxfs() );
        }
        if ( dto.getPxjb() != null ) {
            trmTrainActapply.setPxjb( dto.getPxjb() );
        }
        if ( dto.getSjpxrs() != null ) {
            trmTrainActapply.setSjpxrs( dto.getSjpxrs() );
        }
        if ( dto.getPxhdbm() != null ) {
            trmTrainActapply.setPxhdbm( dto.getPxhdbm() );
        }
        if ( dto.getPxnd() != null ) {
            trmTrainActapply.setPxnd( dto.getPxnd() );
        }
        if ( dto.getSfqdxy() != null ) {
            trmTrainActapply.setSfqdxy( dto.getSfqdxy() );
        }
        if ( dto.getPxyf() != null ) {
            trmTrainActapply.setPxyf( dto.getPxyf() );
        }
        if ( dto.getPxlb() != null ) {
            trmTrainActapply.setPxlb( dto.getPxlb() );
        }
        if ( dto.getTrmtrainactapplyname() != null ) {
            trmTrainActapply.setTrmtrainactapplyname( dto.getTrmtrainactapplyname() );
        }
        if ( dto.getPxdxlb() != null ) {
            trmTrainActapply.setPxdxlb( dto.getPxdxlb() );
        }
        if ( dto.getCbdw() != null ) {
            trmTrainActapply.setCbdw( dto.getCbdw() );
        }
        if ( dto.getZbdw() != null ) {
            trmTrainActapply.setZbdw( dto.getZbdw() );
        }
        if ( dto.getPxjd() != null ) {
            trmTrainActapply.setPxjd( dto.getPxjd() );
        }
        if ( dto.getXbdw() != null ) {
            trmTrainActapply.setXbdw( dto.getXbdw() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            trmTrainActapply.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getTrmtrainactapplyid() != null ) {
            trmTrainActapply.setTrmtrainactapplyid( dto.getTrmtrainactapplyid() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainActapply.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainActapply.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainActapply.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainActapply.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainActapply.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            trmTrainActapply.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }

        return trmTrainActapply;
    }

    @Override
    public TrmTrainActapplyDTO toDto(TrmTrainActapply entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainActapplyDTO trmTrainActapplyDTO = new TrmTrainActapplyDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainActapplyDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainActapplyDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getJhpxrs() != null ) {
            trmTrainActapplyDTO.setJhpxrs( entity.getJhpxrs() );
        }
        if ( entity.getPxmb() != null ) {
            trmTrainActapplyDTO.setPxmb( entity.getPxmb() );
        }
        if ( entity.getPxnr() != null ) {
            trmTrainActapplyDTO.setPxnr( entity.getPxnr() );
        }
        if ( entity.getPxfs() != null ) {
            trmTrainActapplyDTO.setPxfs( entity.getPxfs() );
        }
        if ( entity.getPxjb() != null ) {
            trmTrainActapplyDTO.setPxjb( entity.getPxjb() );
        }
        if ( entity.getSjpxrs() != null ) {
            trmTrainActapplyDTO.setSjpxrs( entity.getSjpxrs() );
        }
        if ( entity.getPxhdbm() != null ) {
            trmTrainActapplyDTO.setPxhdbm( entity.getPxhdbm() );
        }
        if ( entity.getPxnd() != null ) {
            trmTrainActapplyDTO.setPxnd( entity.getPxnd() );
        }
        if ( entity.getSfqdxy() != null ) {
            trmTrainActapplyDTO.setSfqdxy( entity.getSfqdxy() );
        }
        if ( entity.getPxyf() != null ) {
            trmTrainActapplyDTO.setPxyf( entity.getPxyf() );
        }
        if ( entity.getPxlb() != null ) {
            trmTrainActapplyDTO.setPxlb( entity.getPxlb() );
        }
        if ( entity.getTrmtrainactapplyname() != null ) {
            trmTrainActapplyDTO.setTrmtrainactapplyname( entity.getTrmtrainactapplyname() );
        }
        if ( entity.getPxdxlb() != null ) {
            trmTrainActapplyDTO.setPxdxlb( entity.getPxdxlb() );
        }
        if ( entity.getCbdw() != null ) {
            trmTrainActapplyDTO.setCbdw( entity.getCbdw() );
        }
        if ( entity.getZbdw() != null ) {
            trmTrainActapplyDTO.setZbdw( entity.getZbdw() );
        }
        if ( entity.getPxjd() != null ) {
            trmTrainActapplyDTO.setPxjd( entity.getPxjd() );
        }
        if ( entity.getXbdw() != null ) {
            trmTrainActapplyDTO.setXbdw( entity.getXbdw() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            trmTrainActapplyDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getTrmtrainactapplyid() != null ) {
            trmTrainActapplyDTO.setTrmtrainactapplyid( entity.getTrmtrainactapplyid() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainActapplyDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainActapplyDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainActapplyDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainActapplyDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainActapplyDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            trmTrainActapplyDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }

        return trmTrainActapplyDTO;
    }

    @Override
    public List<TrmTrainActapply> toDomain(List<TrmTrainActapplyDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainActapply> list = new ArrayList<TrmTrainActapply>( dtoList.size() );
        for ( TrmTrainActapplyDTO trmTrainActapplyDTO : dtoList ) {
            list.add( toDomain( trmTrainActapplyDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainActapplyDTO> toDto(List<TrmTrainActapply> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainActapplyDTO> list = new ArrayList<TrmTrainActapplyDTO>( entityList.size() );
        for ( TrmTrainActapply trmTrainActapply : entityList ) {
            list.add( toDto( trmTrainActapply ) );
        }

        return list;
    }
}
