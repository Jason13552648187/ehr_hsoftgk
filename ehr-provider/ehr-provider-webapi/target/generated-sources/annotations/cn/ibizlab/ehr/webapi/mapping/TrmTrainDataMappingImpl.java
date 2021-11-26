package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainData;
import cn.ibizlab.ehr.webapi.dto.TrmTrainDataDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrainDataMappingImpl implements TrmTrainDataMapping {

    @Override
    public TrmTrainData toDomain(TrmTrainDataDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainData trmTrainData = new TrmTrainData();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainData.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainData.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getYysl() != null ) {
            trmTrainData.setYysl( dto.getYysl() );
        }
        if ( dto.getZlbm() != null ) {
            trmTrainData.setZlbm( dto.getZlbm() );
        }
        if ( dto.getSfgx() != null ) {
            trmTrainData.setSfgx( dto.getSfgx() );
        }
        if ( dto.getCbs() != null ) {
            trmTrainData.setCbs( dto.getCbs() );
        }
        if ( dto.getXysl() != null ) {
            trmTrainData.setXysl( dto.getXysl() );
        }
        if ( dto.getCjgs() != null ) {
            trmTrainData.setCjgs( dto.getCjgs() );
        }
        if ( dto.getTrmtraindataname() != null ) {
            trmTrainData.setTrmtraindataname( dto.getTrmtraindataname() );
        }
        if ( dto.getSfgc() != null ) {
            trmTrainData.setSfgc( dto.getSfgc() );
        }
        if ( dto.getZz() != null ) {
            trmTrainData.setZz( dto.getZz() );
        }
        if ( dto.getZllb() != null ) {
            trmTrainData.setZllb( dto.getZllb() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmTrainData.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getTrmtrainagencyid() != null ) {
            trmTrainData.setTrmtrainagencyid( dto.getTrmtrainagencyid() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainData.setCreateman( dto.getCreateman() );
        }
        if ( dto.getTrmtraindataid() != null ) {
            trmTrainData.setTrmtraindataid( dto.getTrmtraindataid() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainData.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainData.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainData.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainData.setEnable( dto.getEnable() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmTrainData.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getTrmtrainagencyname() != null ) {
            trmTrainData.setTrmtrainagencyname( dto.getTrmtrainagencyname() );
        }

        return trmTrainData;
    }

    @Override
    public TrmTrainDataDTO toDto(TrmTrainData entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainDataDTO trmTrainDataDTO = new TrmTrainDataDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainDataDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainDataDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getYysl() != null ) {
            trmTrainDataDTO.setYysl( entity.getYysl() );
        }
        if ( entity.getZlbm() != null ) {
            trmTrainDataDTO.setZlbm( entity.getZlbm() );
        }
        if ( entity.getSfgx() != null ) {
            trmTrainDataDTO.setSfgx( entity.getSfgx() );
        }
        if ( entity.getCbs() != null ) {
            trmTrainDataDTO.setCbs( entity.getCbs() );
        }
        if ( entity.getXysl() != null ) {
            trmTrainDataDTO.setXysl( entity.getXysl() );
        }
        if ( entity.getCjgs() != null ) {
            trmTrainDataDTO.setCjgs( entity.getCjgs() );
        }
        if ( entity.getTrmtraindataname() != null ) {
            trmTrainDataDTO.setTrmtraindataname( entity.getTrmtraindataname() );
        }
        if ( entity.getSfgc() != null ) {
            trmTrainDataDTO.setSfgc( entity.getSfgc() );
        }
        if ( entity.getZz() != null ) {
            trmTrainDataDTO.setZz( entity.getZz() );
        }
        if ( entity.getZllb() != null ) {
            trmTrainDataDTO.setZllb( entity.getZllb() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmTrainDataDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getTrmtrainagencyid() != null ) {
            trmTrainDataDTO.setTrmtrainagencyid( entity.getTrmtrainagencyid() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainDataDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getTrmtraindataid() != null ) {
            trmTrainDataDTO.setTrmtraindataid( entity.getTrmtraindataid() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainDataDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainDataDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainDataDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainDataDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmTrainDataDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getTrmtrainagencyname() != null ) {
            trmTrainDataDTO.setTrmtrainagencyname( entity.getTrmtrainagencyname() );
        }

        return trmTrainDataDTO;
    }

    @Override
    public List<TrmTrainData> toDomain(List<TrmTrainDataDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainData> list = new ArrayList<TrmTrainData>( dtoList.size() );
        for ( TrmTrainDataDTO trmTrainDataDTO : dtoList ) {
            list.add( toDomain( trmTrainDataDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainDataDTO> toDto(List<TrmTrainData> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainDataDTO> list = new ArrayList<TrmTrainDataDTO>( entityList.size() );
        for ( TrmTrainData trmTrainData : entityList ) {
            list.add( toDto( trmTrainData ) );
        }

        return list;
    }
}
