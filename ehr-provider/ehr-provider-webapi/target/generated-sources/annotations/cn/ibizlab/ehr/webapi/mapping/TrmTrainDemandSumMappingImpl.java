package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainDemandSum;
import cn.ibizlab.ehr.webapi.dto.TrmTrainDemandSumDTO;
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
    date = "2021-09-04T00:31:50+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrainDemandSumMappingImpl implements TrmTrainDemandSumMapping {

    @Override
    public TrmTrainDemandSum toDomain(TrmTrainDemandSumDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainDemandSum trmTrainDemandSum = new TrmTrainDemandSum();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainDemandSum.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainDemandSum.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXqrs() != null ) {
            trmTrainDemandSum.setXqrs( dto.getXqrs() );
        }
        if ( dto.getHzrq() != null ) {
            trmTrainDemandSum.setHzrq( dto.getHzrq() );
        }
        if ( dto.getTrmtraindemandsumname() != null ) {
            trmTrainDemandSum.setTrmtraindemandsumname( dto.getTrmtraindemandsumname() );
        }
        if ( dto.getTrmtraincourseid() != null ) {
            trmTrainDemandSum.setTrmtraincourseid( dto.getTrmtraincourseid() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmTrainDemandSum.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getTrmtraindemandid() != null ) {
            trmTrainDemandSum.setTrmtraindemandid( dto.getTrmtraindemandid() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainDemandSum.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainDemandSum.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getTrmtraindemandsumid() != null ) {
            trmTrainDemandSum.setTrmtraindemandsumid( dto.getTrmtraindemandsumid() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainDemandSum.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainDemandSum.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainDemandSum.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getKcbm() != null ) {
            trmTrainDemandSum.setKcbm( dto.getKcbm() );
        }
        if ( dto.getTrmtraindemandname() != null ) {
            trmTrainDemandSum.setTrmtraindemandname( dto.getTrmtraindemandname() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmTrainDemandSum.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getTrmtraincoursename() != null ) {
            trmTrainDemandSum.setTrmtraincoursename( dto.getTrmtraincoursename() );
        }

        return trmTrainDemandSum;
    }

    @Override
    public TrmTrainDemandSumDTO toDto(TrmTrainDemandSum entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainDemandSumDTO trmTrainDemandSumDTO = new TrmTrainDemandSumDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainDemandSumDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainDemandSumDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXqrs() != null ) {
            trmTrainDemandSumDTO.setXqrs( entity.getXqrs() );
        }
        if ( entity.getHzrq() != null ) {
            trmTrainDemandSumDTO.setHzrq( entity.getHzrq() );
        }
        if ( entity.getTrmtraindemandsumname() != null ) {
            trmTrainDemandSumDTO.setTrmtraindemandsumname( entity.getTrmtraindemandsumname() );
        }
        if ( entity.getTrmtraincourseid() != null ) {
            trmTrainDemandSumDTO.setTrmtraincourseid( entity.getTrmtraincourseid() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmTrainDemandSumDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getTrmtraindemandid() != null ) {
            trmTrainDemandSumDTO.setTrmtraindemandid( entity.getTrmtraindemandid() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainDemandSumDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainDemandSumDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getTrmtraindemandsumid() != null ) {
            trmTrainDemandSumDTO.setTrmtraindemandsumid( entity.getTrmtraindemandsumid() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainDemandSumDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainDemandSumDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainDemandSumDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getKcbm() != null ) {
            trmTrainDemandSumDTO.setKcbm( entity.getKcbm() );
        }
        if ( entity.getTrmtraindemandname() != null ) {
            trmTrainDemandSumDTO.setTrmtraindemandname( entity.getTrmtraindemandname() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmTrainDemandSumDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getTrmtraincoursename() != null ) {
            trmTrainDemandSumDTO.setTrmtraincoursename( entity.getTrmtraincoursename() );
        }

        return trmTrainDemandSumDTO;
    }

    @Override
    public List<TrmTrainDemandSum> toDomain(List<TrmTrainDemandSumDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainDemandSum> list = new ArrayList<TrmTrainDemandSum>( dtoList.size() );
        for ( TrmTrainDemandSumDTO trmTrainDemandSumDTO : dtoList ) {
            list.add( toDomain( trmTrainDemandSumDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainDemandSumDTO> toDto(List<TrmTrainDemandSum> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainDemandSumDTO> list = new ArrayList<TrmTrainDemandSumDTO>( entityList.size() );
        for ( TrmTrainDemandSum trmTrainDemandSum : entityList ) {
            list.add( toDto( trmTrainDemandSum ) );
        }

        return list;
    }
}
