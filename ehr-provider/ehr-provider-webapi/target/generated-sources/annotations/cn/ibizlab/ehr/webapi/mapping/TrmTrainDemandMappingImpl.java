package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainDemand;
import cn.ibizlab.ehr.webapi.dto.TrmTrainDemandDTO;
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
    date = "2021-09-04T00:31:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrainDemandMappingImpl implements TrmTrainDemandMapping {

    @Override
    public TrmTrainDemand toDomain(TrmTrainDemandDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainDemand trmTrainDemand = new TrmTrainDemand();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainDemand.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainDemand.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getHznd() != null ) {
            trmTrainDemand.setHznd( dto.getHznd() );
        }
        if ( dto.getHzjd() != null ) {
            trmTrainDemand.setHzjd( dto.getHzjd() );
        }
        if ( dto.getHzrs() != null ) {
            trmTrainDemand.setHzrs( dto.getHzrs() );
        }
        if ( dto.getTrmtraindemandname() != null ) {
            trmTrainDemand.setTrmtraindemandname( dto.getTrmtraindemandname() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmTrainDemand.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainDemand.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainDemand.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainDemand.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainDemand.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainDemand.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getTrmtraindemandid() != null ) {
            trmTrainDemand.setTrmtraindemandid( dto.getTrmtraindemandid() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmTrainDemand.setOrmorgname( dto.getOrmorgname() );
        }

        return trmTrainDemand;
    }

    @Override
    public TrmTrainDemandDTO toDto(TrmTrainDemand entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainDemandDTO trmTrainDemandDTO = new TrmTrainDemandDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainDemandDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainDemandDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getHznd() != null ) {
            trmTrainDemandDTO.setHznd( entity.getHznd() );
        }
        if ( entity.getHzjd() != null ) {
            trmTrainDemandDTO.setHzjd( entity.getHzjd() );
        }
        if ( entity.getHzrs() != null ) {
            trmTrainDemandDTO.setHzrs( entity.getHzrs() );
        }
        if ( entity.getTrmtraindemandname() != null ) {
            trmTrainDemandDTO.setTrmtraindemandname( entity.getTrmtraindemandname() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmTrainDemandDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainDemandDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainDemandDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainDemandDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainDemandDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainDemandDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getTrmtraindemandid() != null ) {
            trmTrainDemandDTO.setTrmtraindemandid( entity.getTrmtraindemandid() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmTrainDemandDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return trmTrainDemandDTO;
    }

    @Override
    public List<TrmTrainDemand> toDomain(List<TrmTrainDemandDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainDemand> list = new ArrayList<TrmTrainDemand>( dtoList.size() );
        for ( TrmTrainDemandDTO trmTrainDemandDTO : dtoList ) {
            list.add( toDomain( trmTrainDemandDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainDemandDTO> toDto(List<TrmTrainDemand> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainDemandDTO> list = new ArrayList<TrmTrainDemandDTO>( entityList.size() );
        for ( TrmTrainDemand trmTrainDemand : entityList ) {
            list.add( toDto( trmTrainDemand ) );
        }

        return list;
    }
}
