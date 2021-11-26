package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainFillin;
import cn.ibizlab.ehr.webapi.dto.TrmTrainFillinDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrainFillinMappingImpl implements TrmTrainFillinMapping {

    @Override
    public TrmTrainFillin toDomain(TrmTrainFillinDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainFillin trmTrainFillin = new TrmTrainFillin();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainFillin.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainFillin.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getTrmtrainfillinname() != null ) {
            trmTrainFillin.setTrmtrainfillinname( dto.getTrmtrainfillinname() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmTrainFillin.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getTrmtrainfillinid2() != null ) {
            trmTrainFillin.setTrmtrainfillinid2( dto.getTrmtrainfillinid2() );
        }
        if ( dto.getTrmdepartid() != null ) {
            trmTrainFillin.setTrmdepartid( dto.getTrmdepartid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            trmTrainFillin.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainFillin.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainFillin.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainFillin.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainFillin.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainFillin.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getTrmtrainfillinid() != null ) {
            trmTrainFillin.setTrmtrainfillinid( dto.getTrmtrainfillinid() );
        }
        if ( dto.getTrmtrainfillinname2() != null ) {
            trmTrainFillin.setTrmtrainfillinname2( dto.getTrmtrainfillinname2() );
        }
        if ( dto.getNd() != null ) {
            trmTrainFillin.setNd( dto.getNd() );
        }
        if ( dto.getJd() != null ) {
            trmTrainFillin.setJd( dto.getJd() );
        }
        if ( dto.getZzdzs() != null ) {
            trmTrainFillin.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmTrainFillin.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getTrmdepartname() != null ) {
            trmTrainFillin.setTrmdepartname( dto.getTrmdepartname() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            trmTrainFillin.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getShortname() != null ) {
            trmTrainFillin.setShortname( dto.getShortname() );
        }
        if ( dto.getJzrq() != null ) {
            trmTrainFillin.setJzrq( dto.getJzrq() );
        }

        return trmTrainFillin;
    }

    @Override
    public TrmTrainFillinDTO toDto(TrmTrainFillin entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainFillinDTO trmTrainFillinDTO = new TrmTrainFillinDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainFillinDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainFillinDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getTrmtrainfillinname() != null ) {
            trmTrainFillinDTO.setTrmtrainfillinname( entity.getTrmtrainfillinname() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmTrainFillinDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getTrmtrainfillinid2() != null ) {
            trmTrainFillinDTO.setTrmtrainfillinid2( entity.getTrmtrainfillinid2() );
        }
        if ( entity.getTrmdepartid() != null ) {
            trmTrainFillinDTO.setTrmdepartid( entity.getTrmdepartid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            trmTrainFillinDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainFillinDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainFillinDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainFillinDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainFillinDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainFillinDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getTrmtrainfillinid() != null ) {
            trmTrainFillinDTO.setTrmtrainfillinid( entity.getTrmtrainfillinid() );
        }
        if ( entity.getTrmtrainfillinname2() != null ) {
            trmTrainFillinDTO.setTrmtrainfillinname2( entity.getTrmtrainfillinname2() );
        }
        if ( entity.getNd() != null ) {
            trmTrainFillinDTO.setNd( entity.getNd() );
        }
        if ( entity.getJd() != null ) {
            trmTrainFillinDTO.setJd( entity.getJd() );
        }
        if ( entity.getZzdzs() != null ) {
            trmTrainFillinDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmTrainFillinDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getTrmdepartname() != null ) {
            trmTrainFillinDTO.setTrmdepartname( entity.getTrmdepartname() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            trmTrainFillinDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getShortname() != null ) {
            trmTrainFillinDTO.setShortname( entity.getShortname() );
        }
        if ( entity.getJzrq() != null ) {
            trmTrainFillinDTO.setJzrq( entity.getJzrq() );
        }

        return trmTrainFillinDTO;
    }

    @Override
    public List<TrmTrainFillin> toDomain(List<TrmTrainFillinDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainFillin> list = new ArrayList<TrmTrainFillin>( dtoList.size() );
        for ( TrmTrainFillinDTO trmTrainFillinDTO : dtoList ) {
            list.add( toDomain( trmTrainFillinDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainFillinDTO> toDto(List<TrmTrainFillin> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainFillinDTO> list = new ArrayList<TrmTrainFillinDTO>( entityList.size() );
        for ( TrmTrainFillin trmTrainFillin : entityList ) {
            list.add( toDto( trmTrainFillin ) );
        }

        return list;
    }
}
