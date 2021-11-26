package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.att.domain.AttEnsummary;
import cn.ibizlab.ehr.webapi.dto.AttEnsummaryDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class AttEnsummaryMappingImpl implements AttEnsummaryMapping {

    @Override
    public AttEnsummary toDomain(AttEnsummaryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AttEnsummary attEnsummary = new AttEnsummary();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            attEnsummary.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            attEnsummary.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getGs() != null ) {
            attEnsummary.setGs( dto.getGs() );
        }
        if ( dto.getZtf() != null ) {
            attEnsummary.setZtf( dto.getZtf() );
        }
        if ( dto.getBj() != null ) {
            attEnsummary.setBj( dto.getBj() );
        }
        if ( dto.getCc() != null ) {
            attEnsummary.setCc( dto.getCc() );
        }
        if ( dto.getBegindate() != null ) {
            attEnsummary.setBegindate( dto.getBegindate() );
        }
        if ( dto.getNd() != null ) {
            attEnsummary.setNd( dto.getNd() );
        }
        if ( dto.getNx() != null ) {
            attEnsummary.setNx( dto.getNx() );
        }
        if ( dto.getKg() != null ) {
            attEnsummary.setKg( dto.getKg() );
        }
        if ( dto.getYf() != null ) {
            attEnsummary.setYf( dto.getYf() );
        }
        if ( dto.getGzrjb() != null ) {
            attEnsummary.setGzrjb( dto.getGzrjb() );
        }
        if ( dto.getJs() != null ) {
            attEnsummary.setJs( dto.getJs() );
        }
        if ( dto.getFdjrjb() != null ) {
            attEnsummary.setFdjrjb( dto.getFdjrjb() );
        }
        if ( dto.getCdf() != null ) {
            attEnsummary.setCdf( dto.getCdf() );
        }
        if ( dto.getZtc() != null ) {
            attEnsummary.setZtc( dto.getZtc() );
        }
        if ( dto.getZt() != null ) {
            attEnsummary.setZt( dto.getZt() );
        }
        if ( dto.getTcxx() != null ) {
            attEnsummary.setTcxx( dto.getTcxx() );
        }
        if ( dto.getRemarkreason() != null ) {
            attEnsummary.setRemarkreason( dto.getRemarkreason() );
        }
        if ( dto.getZhts() != null ) {
            attEnsummary.setZhts( dto.getZhts() );
        }
        if ( dto.getTx() != null ) {
            attEnsummary.setTx( dto.getTx() );
        }
        if ( dto.getWqdts() != null ) {
            attEnsummary.setWqdts( dto.getWqdts() );
        }
        if ( dto.getBr() != null ) {
            attEnsummary.setBr( dto.getBr() );
        }
        if ( dto.getTq() != null ) {
            attEnsummary.setTq( dto.getTq() );
        }
        if ( dto.getSj() != null ) {
            attEnsummary.setSj( dto.getSj() );
        }
        if ( dto.getQq() != null ) {
            attEnsummary.setQq( dto.getQq() );
        }
        if ( dto.getPc() != null ) {
            attEnsummary.setPc( dto.getPc() );
        }
        if ( dto.getSz() != null ) {
            attEnsummary.setSz( dto.getSz() );
        }
        if ( dto.getCd() != null ) {
            attEnsummary.setCd( dto.getCd() );
        }
        if ( dto.getBq() != null ) {
            attEnsummary.setBq( dto.getBq() );
        }
        if ( dto.getJh() != null ) {
            attEnsummary.setJh( dto.getJh() );
        }
        if ( dto.getXxrjb() != null ) {
            attEnsummary.setXxrjb( dto.getXxrjb() );
        }
        if ( dto.getSjcqts() != null ) {
            attEnsummary.setSjcqts( dto.getSjcqts() );
        }
        if ( dto.getAttensummaryname() != null ) {
            attEnsummary.setAttensummaryname( dto.getAttensummaryname() );
        }
        if ( dto.getDescription() != null ) {
            attEnsummary.setDescription( dto.getDescription() );
        }
        if ( dto.getCj() != null ) {
            attEnsummary.setCj( dto.getCj() );
        }
        if ( dto.getQt() != null ) {
            attEnsummary.setQt( dto.getQt() );
        }
        if ( dto.getCdc() != null ) {
            attEnsummary.setCdc( dto.getCdc() );
        }
        if ( dto.getEnddate() != null ) {
            attEnsummary.setEnddate( dto.getEnddate() );
        }
        if ( dto.getBz() != null ) {
            attEnsummary.setBz( dto.getBz() );
        }
        if ( dto.getYq() != null ) {
            attEnsummary.setYq( dto.getYq() );
        }
        if ( dto.getQtdxj() != null ) {
            attEnsummary.setQtdxj( dto.getQtdxj() );
        }
        if ( dto.getSdt() != null ) {
            attEnsummary.setSdt( dto.getSdt() );
        }
        if ( dto.getYgbh() != null ) {
            attEnsummary.setYgbh( dto.getYgbh() );
        }
        if ( dto.getPimpersonname() != null ) {
            attEnsummary.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getPimpersonid() != null ) {
            attEnsummary.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrgid() != null ) {
            attEnsummary.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            attEnsummary.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            attEnsummary.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            attEnsummary.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            attEnsummary.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            attEnsummary.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrgsectorid() != null ) {
            attEnsummary.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getAttensummaryid() != null ) {
            attEnsummary.setAttensummaryid( dto.getAttensummaryid() );
        }
        if ( dto.getZw() != null ) {
            attEnsummary.setZw( dto.getZw() );
        }
        if ( dto.getZjhm() != null ) {
            attEnsummary.setZjhm( dto.getZjhm() );
        }
        if ( dto.getOrmorgid() != null ) {
            attEnsummary.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmorgname() != null ) {
            attEnsummary.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            attEnsummary.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            attEnsummary.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }

        return attEnsummary;
    }

    @Override
    public AttEnsummaryDTO toDto(AttEnsummary entity) {
        if ( entity == null ) {
            return null;
        }

        AttEnsummaryDTO attEnsummaryDTO = new AttEnsummaryDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            attEnsummaryDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            attEnsummaryDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getGs() != null ) {
            attEnsummaryDTO.setGs( entity.getGs() );
        }
        if ( entity.getZtf() != null ) {
            attEnsummaryDTO.setZtf( entity.getZtf() );
        }
        if ( entity.getBj() != null ) {
            attEnsummaryDTO.setBj( entity.getBj() );
        }
        if ( entity.getCc() != null ) {
            attEnsummaryDTO.setCc( entity.getCc() );
        }
        if ( entity.getBegindate() != null ) {
            attEnsummaryDTO.setBegindate( entity.getBegindate() );
        }
        if ( entity.getNd() != null ) {
            attEnsummaryDTO.setNd( entity.getNd() );
        }
        if ( entity.getNx() != null ) {
            attEnsummaryDTO.setNx( entity.getNx() );
        }
        if ( entity.getKg() != null ) {
            attEnsummaryDTO.setKg( entity.getKg() );
        }
        if ( entity.getYf() != null ) {
            attEnsummaryDTO.setYf( entity.getYf() );
        }
        if ( entity.getGzrjb() != null ) {
            attEnsummaryDTO.setGzrjb( entity.getGzrjb() );
        }
        if ( entity.getJs() != null ) {
            attEnsummaryDTO.setJs( entity.getJs() );
        }
        if ( entity.getFdjrjb() != null ) {
            attEnsummaryDTO.setFdjrjb( entity.getFdjrjb() );
        }
        if ( entity.getCdf() != null ) {
            attEnsummaryDTO.setCdf( entity.getCdf() );
        }
        if ( entity.getZtc() != null ) {
            attEnsummaryDTO.setZtc( entity.getZtc() );
        }
        if ( entity.getZt() != null ) {
            attEnsummaryDTO.setZt( entity.getZt() );
        }
        if ( entity.getTcxx() != null ) {
            attEnsummaryDTO.setTcxx( entity.getTcxx() );
        }
        if ( entity.getRemarkreason() != null ) {
            attEnsummaryDTO.setRemarkreason( entity.getRemarkreason() );
        }
        if ( entity.getZhts() != null ) {
            attEnsummaryDTO.setZhts( entity.getZhts() );
        }
        if ( entity.getTx() != null ) {
            attEnsummaryDTO.setTx( entity.getTx() );
        }
        if ( entity.getWqdts() != null ) {
            attEnsummaryDTO.setWqdts( entity.getWqdts() );
        }
        if ( entity.getBr() != null ) {
            attEnsummaryDTO.setBr( entity.getBr() );
        }
        if ( entity.getTq() != null ) {
            attEnsummaryDTO.setTq( entity.getTq() );
        }
        if ( entity.getSj() != null ) {
            attEnsummaryDTO.setSj( entity.getSj() );
        }
        if ( entity.getQq() != null ) {
            attEnsummaryDTO.setQq( entity.getQq() );
        }
        if ( entity.getPc() != null ) {
            attEnsummaryDTO.setPc( entity.getPc() );
        }
        if ( entity.getSz() != null ) {
            attEnsummaryDTO.setSz( entity.getSz() );
        }
        if ( entity.getCd() != null ) {
            attEnsummaryDTO.setCd( entity.getCd() );
        }
        if ( entity.getBq() != null ) {
            attEnsummaryDTO.setBq( entity.getBq() );
        }
        if ( entity.getJh() != null ) {
            attEnsummaryDTO.setJh( entity.getJh() );
        }
        if ( entity.getXxrjb() != null ) {
            attEnsummaryDTO.setXxrjb( entity.getXxrjb() );
        }
        if ( entity.getSjcqts() != null ) {
            attEnsummaryDTO.setSjcqts( entity.getSjcqts() );
        }
        if ( entity.getAttensummaryname() != null ) {
            attEnsummaryDTO.setAttensummaryname( entity.getAttensummaryname() );
        }
        if ( entity.getDescription() != null ) {
            attEnsummaryDTO.setDescription( entity.getDescription() );
        }
        if ( entity.getCj() != null ) {
            attEnsummaryDTO.setCj( entity.getCj() );
        }
        if ( entity.getQt() != null ) {
            attEnsummaryDTO.setQt( entity.getQt() );
        }
        if ( entity.getCdc() != null ) {
            attEnsummaryDTO.setCdc( entity.getCdc() );
        }
        if ( entity.getEnddate() != null ) {
            attEnsummaryDTO.setEnddate( entity.getEnddate() );
        }
        if ( entity.getBz() != null ) {
            attEnsummaryDTO.setBz( entity.getBz() );
        }
        if ( entity.getYq() != null ) {
            attEnsummaryDTO.setYq( entity.getYq() );
        }
        if ( entity.getQtdxj() != null ) {
            attEnsummaryDTO.setQtdxj( entity.getQtdxj() );
        }
        if ( entity.getSdt() != null ) {
            attEnsummaryDTO.setSdt( entity.getSdt() );
        }
        if ( entity.getYgbh() != null ) {
            attEnsummaryDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getPimpersonname() != null ) {
            attEnsummaryDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getPimpersonid() != null ) {
            attEnsummaryDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrgid() != null ) {
            attEnsummaryDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            attEnsummaryDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            attEnsummaryDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            attEnsummaryDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            attEnsummaryDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            attEnsummaryDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrgsectorid() != null ) {
            attEnsummaryDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getAttensummaryid() != null ) {
            attEnsummaryDTO.setAttensummaryid( entity.getAttensummaryid() );
        }
        if ( entity.getZw() != null ) {
            attEnsummaryDTO.setZw( entity.getZw() );
        }
        if ( entity.getZjhm() != null ) {
            attEnsummaryDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getOrmorgid() != null ) {
            attEnsummaryDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmorgname() != null ) {
            attEnsummaryDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            attEnsummaryDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            attEnsummaryDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }

        return attEnsummaryDTO;
    }

    @Override
    public List<AttEnsummary> toDomain(List<AttEnsummaryDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AttEnsummary> list = new ArrayList<AttEnsummary>( dtoList.size() );
        for ( AttEnsummaryDTO attEnsummaryDTO : dtoList ) {
            list.add( toDomain( attEnsummaryDTO ) );
        }

        return list;
    }

    @Override
    public List<AttEnsummaryDTO> toDto(List<AttEnsummary> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttEnsummaryDTO> list = new ArrayList<AttEnsummaryDTO>( entityList.size() );
        for ( AttEnsummary attEnsummary : entityList ) {
            list.add( toDto( attEnsummary ) );
        }

        return list;
    }
}
