package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainActment;
import cn.ibizlab.ehr.webapi.dto.TrmTrainActmentDTO;
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
    date = "2021-09-04T00:31:49+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrainActmentMappingImpl implements TrmTrainActmentMapping {

    @Override
    public TrmTrainActment toDomain(TrmTrainActmentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainActment trmTrainActment = new TrmTrainActment();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainActment.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainActment.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDcwjtm() != null ) {
            trmTrainActment.setDcwjtm( dto.getDcwjtm() );
        }
        if ( dto.getBz() != null ) {
            trmTrainActment.setBz( dto.getBz() );
        }
        if ( dto.getPxjg() != null ) {
            trmTrainActment.setPxjg( dto.getPxjg() );
        }
        if ( dto.getTrmtrainactmentname() != null ) {
            trmTrainActment.setTrmtrainactmentname( dto.getTrmtrainactmentname() );
        }
        if ( dto.getTrmtrainactapplyid() != null ) {
            trmTrainActment.setTrmtrainactapplyid( dto.getTrmtrainactapplyid() );
        }
        if ( dto.getEvaltarget() != null ) {
            trmTrainActment.setEvaltarget( dto.getEvaltarget() );
        }
        if ( dto.getEvalcontents() != null ) {
            trmTrainActment.setEvalcontents( dto.getEvalcontents() );
        }
        if ( dto.getEvaltime() != null ) {
            trmTrainActment.setEvaltime( dto.getEvaltime() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainActment.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainActment.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getTrmtrainactmentid() != null ) {
            trmTrainActment.setTrmtrainactmentid( dto.getTrmtrainactmentid() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainActment.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainActment.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainActment.setEnable( dto.getEnable() );
        }
        if ( dto.getTrmtrainactapplyname() != null ) {
            trmTrainActment.setTrmtrainactapplyname( dto.getTrmtrainactapplyname() );
        }

        return trmTrainActment;
    }

    @Override
    public TrmTrainActmentDTO toDto(TrmTrainActment entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainActmentDTO trmTrainActmentDTO = new TrmTrainActmentDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainActmentDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainActmentDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDcwjtm() != null ) {
            trmTrainActmentDTO.setDcwjtm( entity.getDcwjtm() );
        }
        if ( entity.getBz() != null ) {
            trmTrainActmentDTO.setBz( entity.getBz() );
        }
        if ( entity.getPxjg() != null ) {
            trmTrainActmentDTO.setPxjg( entity.getPxjg() );
        }
        if ( entity.getTrmtrainactmentname() != null ) {
            trmTrainActmentDTO.setTrmtrainactmentname( entity.getTrmtrainactmentname() );
        }
        if ( entity.getTrmtrainactapplyid() != null ) {
            trmTrainActmentDTO.setTrmtrainactapplyid( entity.getTrmtrainactapplyid() );
        }
        if ( entity.getEvaltarget() != null ) {
            trmTrainActmentDTO.setEvaltarget( entity.getEvaltarget() );
        }
        if ( entity.getEvalcontents() != null ) {
            trmTrainActmentDTO.setEvalcontents( entity.getEvalcontents() );
        }
        if ( entity.getEvaltime() != null ) {
            trmTrainActmentDTO.setEvaltime( entity.getEvaltime() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainActmentDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainActmentDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getTrmtrainactmentid() != null ) {
            trmTrainActmentDTO.setTrmtrainactmentid( entity.getTrmtrainactmentid() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainActmentDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainActmentDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainActmentDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getTrmtrainactapplyname() != null ) {
            trmTrainActmentDTO.setTrmtrainactapplyname( entity.getTrmtrainactapplyname() );
        }

        return trmTrainActmentDTO;
    }

    @Override
    public List<TrmTrainActment> toDomain(List<TrmTrainActmentDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainActment> list = new ArrayList<TrmTrainActment>( dtoList.size() );
        for ( TrmTrainActmentDTO trmTrainActmentDTO : dtoList ) {
            list.add( toDomain( trmTrainActmentDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainActmentDTO> toDto(List<TrmTrainActment> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainActmentDTO> list = new ArrayList<TrmTrainActmentDTO>( entityList.size() );
        for ( TrmTrainActment trmTrainActment : entityList ) {
            list.add( toDto( trmTrainActment ) );
        }

        return list;
    }
}
